<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    $response = array();
    // include db connect class
    require_once __DIR__ . '/db_connect.php';
    // connecting to db
    $db = new DB_CONNECT();
    if(isset($_GET['lid'])){
	$lid = $_GET['lid'];

	//Get user from user id
	$result = mysql_query("SELECT lid, level, point FROM level WHERE lid = $lid");
	if(!empty($result)){
            if(mysql_num_rows($result) > 0){
                $result = mysql_fetch_array($result);
		$level = array();
                $level["lid"]   = $result["lid"];
		$level["level"] = $result["level"];
		$level["point"] = $result["point"];
		
		//Successful
		$response["success"] = 1;	
		$response["level"] = array();
		array_push($response["level"], $level);
		echo json_encode($response);
            }else{
                $response["success"] = 0;
                $response["message"] = "No level found";
                echo json_encode($response);
            }
        }else{
            $response["success"] = 0;
            $response["message"] = "No level found";
            echo json_encode($response);
        }
    }else{
	$response["success"] = 0;
	$response["message"] = "Require field is missing";
	echo json_encode($response);
    }
?>