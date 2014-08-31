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
    $result = mysql_query("SELECT * FROM members");
 
    // check for empty result
    if (mysql_num_rows($result) > 0) {
        // Post node
        $response["members"] = array();

        while ($row = mysql_fetch_array($result)) {
            // temp user array
            $members = array();
            $members["USERID"]           = $result["USERID"];
            $members["email"]            = $result["email"];
            $members["username"]         = $result["username"];
            $members["password"]         = $result["password"];
            $members["pwd"]              = $result["pwd"];
            $members["fullname"]         = $result["fullname"];
            $members["gender"]           = $result["gender"];
            $members["description"]      = $result["description"];
            $members["country"]          = $result["country"];
            $members["yourviewed"]       = $result["yourviewed"];
            $members["profileviews"]     = $result["profileviews"];
            $members["youviewed"]        = $result["youviewed"];
            $members["addtime"]          = $result["addtime"];
            $members["lastlogin"]        = $result["lastlogin"];
            $members["verified"]         = $result["verified"];
            $members["status"]           = $result["status"];
            $members["profilepicture"]   = $result["profilepicture"];
            $members["remember_me_key"]  = $result["remember_me_key"];
            $members["remember_me_time"] = $result["remember_me_time"];
            $members["ip"]               = $result["ip"];
            $members["lip"]              = $result["lip"];
            $members["website"]          = $result["website"];
            $members["news"]             = $result["news"];
            $members["mylang"]           = $result["mylang"];
            $members["color1"]           = $result["color1"];
            $members["color2"]           = $result["color2"];
            $members["filter"]           = $result["filter"];
            $members["points"]           = $result["points"];
            $members["twitter_id"]       = $result["twitter_id"];
            $members["cover"]            = $result["cover"];
            
            // push single product into final response array
            array_push($response["members"], $members);
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
