<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    $response = array();
    if(isset($_POST['PID'])){
		$pid = $_POST['PID'];
		
        // include db connect class
        require_once __DIR__ . '/db_connect.php';
        // connecting to db
        $db = new DB_CONNECT();
		$view = 0;
		// Get current last view
		$lastview = mysql_query("SELECT last_viewed FROM posts WHERE PID = $pid");
		
		if(!empty($lastview)){
			if(mysql_num_rows($lastview) > 0){
				$lastview = mysql_fetch_array($lastview);
				$view = $lastview['last_viewed'] + 1;

				// mysql inserting a new row
				$result = mysql_query("UPDATE posts SET last_viewed = $view WHERE PID = $pid");
            
				// check if row inserted or not
				if ($result) {
					// successfully inserted into database
					$response["success"] = 1;
					$response["message"] = "Post is updated successfully!";
					// echoing JSON response
					echo json_encode($response);
				} else {
					// failed to insert row
					$response["success"] = 0;
					$response["message"] = "Oops! An error occurred.";
					// echoing JSON response
					echo json_encode($response);
				}
			}
		} else{
				$response["success"] = 0;
				$response["message"] = "LastView is no record!";
				echo json_encode($response);
		}
    } else {
		// required field is missing
        $response["success"] = 0;
        $response["message"] = "Required fields is missing";
 
		//echoing JSON response
       echo json_encode($response);    
    }
?>
