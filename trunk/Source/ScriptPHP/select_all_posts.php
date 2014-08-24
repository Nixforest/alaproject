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
    $result = mysql_query("SELECT PID, USERID, story, pic, youtube_key, url, time_added, date_added,"
            . "favclicks, unfavclicks, view FROM posts");
 
    // check for empty result
    if (mysql_num_rows($result) > 0) {
        // Post node
        $response["posts"] = array();

        while ($row = mysql_fetch_array($result)) {
            // temp user array
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
