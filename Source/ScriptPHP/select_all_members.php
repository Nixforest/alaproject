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
            $members["USERID"]           = $row["USERID"];
            $members["email"]            = $row["email"];
            $members["username"]         = $row["username"];
            $members["password"]         = $row["password"];
            $members["pwd"]              = $row["pwd"];
            $members["fullname"]         = $row["fullname"];
            $members["gender"]           = $row["gender"];
            $members["description"]      = $row["description"];
            $members["country"]          = $row["country"];
            $members["yourviewed"]       = $row["yourviewed"];
            $members["profileviews"]     = $row["profileviews"];
            $members["youviewed"]        = $row["youviewed"];
            $members["addtime"]          = $row["addtime"];
            $members["lastlogin"]        = $row["lastlogin"];
            $members["verified"]         = $row["verified"];
            $members["status"]           = $row["status"];
            $members["profilepicture"]   = $row["profilepicture"];
            $members["remember_me_key"]  = $row["remember_me_key"];
            $members["remember_me_time"] = $row["remember_me_time"];
            $members["ip"]               = $row["ip"];
            $members["lip"]              = $row["lip"];
            $members["website"]          = $row["website"];
            $members["news"]             = $row["news"];
            $members["mylang"]           = $row["mylang"];
            $members["color1"]           = $row["color1"];
            $members["color2"]           = $row["color2"];
            $members["filter"]           = $row["filter"];
            $members["points"]           = $row["points"];
            $members["twitter_id"]       = $row["twitter_id"];
            $members["cover"]            = $row["cover"];
            
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
