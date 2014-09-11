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
    $result = mysql_query("SELECT RID, PID, time, ip, reason FROM posts_reports");
 
    // check for empty result
    if (mysql_num_rows($result) > 0) {
        // Post node
        $response["posts_reports"] = array();

        while ($row = mysql_fetch_array($result)) {
            // temp user array
            $postReports = array();
            $postReports["RID"]      = $row["RID"];
            $postReports["PID"]      = $row["PID"];
            $postReports["time"]     = $row["time"];
            $postReports["ip"]       = $row["ip"];
            $postReports["reason"]   = $row["reason"];
            // push single product into final response array
            array_push($response["posts_reports"], $postReports);
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
