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
    if(isset($_GET['RID'])){
	$rid = $_GET['RID'];

	//Get user from user id
	$result = mysql_query("SELECT RID, PID, time, ip, reason FROM posts_reports WHERE RID = $rid");
	if(!empty($result)){
            if(mysql_num_rows($result) > 0){
                $result = mysql_fetch_array($result);
		$postReport = array();
                $postReport["RID"]      = $result["RID"];
		$postReport["PID"]      = $result["PID"];
		$postReport["time"]     = $result["time"];
                $postReport["ip"]       = $result["ip"];
                $postReport["reason"]   = $result["reason"];
		
		//Successful
		$response["success"] = 1;	
		$response["post_reports"] = array();
		array_push($response["post_reports"], $postReport);
		echo json_encode($response);
            }else{
                $response["success"] = 0;
                $response["message"] = "No post report found";
                echo json_encode($response);
            }
        }else{
            $response["success"] = 0;
            $response["message"] = "No post report found";
            echo json_encode($response);
        }
    }else{
	$response["success"] = 0;
	$response["message"] = "Require field is missing";
	echo json_encode($response);
    }
?>