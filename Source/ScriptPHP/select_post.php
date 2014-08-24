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
    if(isset($_GET['PID'])){
	$postId = $_GET['PID'];

	//Get user from user id
	$result = mysql_query("SELECT PID, USERID, story, pic, youtube_key, url,"
                . "time_added, date_added, favclicks, unfavclicks, view FROM posts WHERE PID = $postId");
	if(!empty($result)){
            if(mysql_num_rows($result) > 0){
                $result = mysql_fetch_array($result);
		$post = array();
                $post["PID"]            = $result["PID"];
		$post["USERID"]         = $result["USERID"];
		$post["story"]          = $result["story"];
		$post["pic"]            = $result["pic"];
		$post["youtube_key"]    = $result["youtube_key"];
                $post["url"]            = $result["url"];
                $post["time_added"]     = $result["time_added"];
                $post["date_added"]     = $result["date_added"];
                $post["favclicks"]      = $result["favclicks"];
                $post["unfavclicks"]    = $result["unfavclicks"];
                $post["view"]           = $result["view"];
		
		//Successful
		$response["success"] = 1;	
		$response["post"] = array();
		array_push($response["post"], $member);
		echo json_encode($response);
            }else{
                $response["success"] = 0;
                $response["message"] = "No post found";
                echo json_encode($response);
            }
        }else{
            $response["success"] = 0;
            $response["message"] = "No post found";
            echo json_encode($response);
        }
    }else{
	$response["success"] = 0;
	$response["message"] = "Require field is missing";
	echo json_encode($response);
    }
?>

