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
    if(isset($_GET['page_number']) && isset($_GET['page_record'])){
        $page_number = $_GET['page_number'];
        $page_record = $_GET['page_record'];
        // mysql select all
        $result = mysql_query("SELECT * FROM posts LIMIT $page_number * $page_record, $page_record");
 
        // check for empty result
        if (mysql_num_rows($result) > 0) {
            // Post node
            $response["posts"] = array();

            while ($row = mysql_fetch_array($result)) {
                // temp user array
                $post = array();
                $post["PID"]            = $row["PID"];
                $post["USERID"]         = $row["USERID"];
                $post["story"]          = $row["story"];
                $post["tags"]           = $row["tags"];
                $post["source"]         = $row["source"];
                $post["nsfw"]           = $row["nsfw"];
                $post["pic"]            = $row["pic"];
                $post["youtube_key"]    = $row["youtube_key"];
                $post["fod_key"]        = $row["fod_key"];
                $post["url"]            = $row["url"];
                $post["time_added"]     = $row["time_added"];
                $post["date_added"]     = $row["date_added"];
                $post["active"]         = $row["active"];
                $post["phase"]          = $row["phase"];
                $post["favclicks"]      = $row["favclicks"];
                $post["last_viewed"]    = $row["last_viewed"];
                $post["mod_yes"]        = $row["mod_yes"];
                $post["mod_no"]         = $row["mod_no"];
                $post["pip"]            = $row["pip"];
                $post["pip2"]           = $row["pip2"];
                $post["unfavclicks"]    = $row["unfavclicks"];
                $post["fix"]            = $row["fix"];
                $post["short"]          = $row["short"];
                $post["ttime"]          = $row["ttime"];
                $post["htime"]          = $row["htime"];
                $post["feat"]           = $row["feat"];
                $post["rec"]            = $row["rec"];
                $post["view"]           = $row["view"];
                $post["bulk"]           = $row["bulk"];
                $post["post_content"]   = $row["post_content"];

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
    }else{
	$response["success"] = 0;
	$response["message"] = "Require field is missing";
	echo json_encode($response);
    }
?>
