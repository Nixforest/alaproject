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
 
    // mysql select all
    $result = mysql_query("SELECT * FROM posts");
 
    // check for empty result
    if (mysql_num_rows($result) > 0) {
        // Post node
        $response["posts"] = array();

        while ($row = mysql_fetch_array($result)) {
            // temp user array
            $post = array();
            $post["PID"]            = $result["PID"];
            $post["USERID"]         = $_POST["USERID"];
            $post["story"]          = $_POST["story"];
            $post["tags"]           = $_POST["tags"];
            $post["source"]         = $_POST["source"];
            $post["nsfw"]           = $_POST["nsfw"];
            $post["pic"]            = $_POST["pic"];
            $post["youtube_key"]    = $_POST["youtube_key"];
            $post["fod_key"]        = $_POST["fod_key"];
            $post["url"]            = $_POST["url"];
            $post["time_added"]     = $_POST["time_added"];
            $post["date_added"]     = $_POST["date_added"];
            $post["active"]         = $_POST["active"];
            $post["phase"]          = $_POST["phase"];
            $post["favclicks"]      = $_POST["favclicks"];
            $post["last_viewed"]    = $_POST["last_viewed"];
            $post["mod_yes"]        = $_POST["mod_yes"];
            $post["mod_no"]         = $_POST["mod_no"];
            $post["pip"]            = $_POST["pip"];
            $post["pip2"]           = $_POST["pip2"];
            $post["unfavclicks"]    = $_POST["unfavclicks"];
            $post["fix"]            = $_POST["fix"];
            $post["short"]          = $_POST["short"];
            $post["ttime"]          = $_POST["ttime"];
            $post["htime"]          = $_POST["htime"];
            $post["feat"]           = $_POST["feat"];
            $post["rec"]            = $_POST["rec"];
            $post["view"]           = $_POST["view"];
            $post["bulk"]           = $_POST["bulk"];
            $post["post_content"]   = $_POST["post_content"];
            
            // push single product into final response array
            array_push($response["posts"], $post);
        }
        // success
        $response["success"] = 1;
        // echo JSON response
        echo json_encode($response);
    } else {
        // no users found
	$response["success"] = 0;
	$response["message"] = "No records";
	// echo no users JSON
	echo json_encode($response);
    }
?>
