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
    if(isset($_GET['FID'])){
	$fid = $_GET['FID'];

	//Get user from user id
	$result = mysql_query("SELECT FID, USERID, PID FROM posts_unfavorited WHERE FID = $fid");
	if(!empty($result)){
            if(mysql_num_rows($result) > 0){
                $result = mysql_fetch_array($result);
		$unfavorited = array();
                $unfavorited["FID"] = $result["FID"];
		$unfavorited["USERID"] = $result["USERID"];
		$unfavorited["PID"] = $result["PID"];
		
		//Successful
		$response["success"] = 1;	
		$response["unfavorited"] = array();
		array_push($response["unfavorited"], $unfavorited);
		echo json_encode($response);
            }else{
                $response["success"] = 0;
                $response["message"] = "No unfavorited found";
                echo json_encode($response);
            }
        }else{
            $response["success"] = 0;
            $response["message"] = "No unfavorited found";
            echo json_encode($response);
        }
    }else{
	$response["success"] = 0;
	$response["message"] = "Require field is missing";
	echo json_encode($response);
    }
?>