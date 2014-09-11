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
	$result = mysql_query("SELECT * FROM posts WHERE PID = $postId");
	if(!empty($result)){
            if(mysql_num_rows($result) > 0){
                $result = mysql_fetch_array($result);
		$post = array();
                $post["PID"]            = $result["PID"];
                $post["USERID"]         = $result["USERID"];
                $post["story"]          = $result["story"];
                $post["tags"]           = $result["tags"];
                $post["source"]         = $result["source"];
                $post["nsfw"]           = $result["nsfw"];
                $post["pic"]            = $result["pic"];
                $post["youtube_key"]    = $result["youtube_key"];
                $post["fod_key"]        = $result["fod_key"];
                $post["url"]            = $result["url"];
                $post["time_added"]     = $result["time_added"];
                $post["date_added"]     = $result["date_added"];
                $post["active"]         = $result["active"];
                $post["phase"]          = $result["phase"];
                $post["favclicks"]      = $result["favclicks"];
                $post["last_viewed"]    = $result["last_viewed"];
                $post["mod_yes"]        = $result["mod_yes"];
                $post["mod_no"]         = $result["mod_no"];
                $post["pip"]            = $result["pip"];
                $post["pip2"]           = $result["pip2"];
                $post["unfavclicks"]    = $result["unfavclicks"];
                $post["fix"]            = $result["fix"];
                $post["short"]          = $result["short"];
                $post["ttime"]          = $result["ttime"];
                $post["htime"]          = $result["htime"];
                $post["feat"]           = $result["feat"];
                $post["rec"]            = $result["rec"];
                $post["view"]           = $result["view"];
                $post["bulk"]           = $result["bulk"];
                $post["post_content"]   = $result["post_content"];
		
		//Successful
		$response["success"] = 1;	
		$response["post"] = array();
		array_push($response["post"], $post);
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

