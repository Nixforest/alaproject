<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    $response = array();
    if(isset($_POST['PID']) && isset($_POST['time']) && isset($_POST['ip']) && isset($_POST['reason'])){
        $postId = $_POST['PID'];
        $time = $_POST['time'];
        $ip = $_POST['ip'];
        $reason = $_POST['reason'];
        
        // include db connect class
        require_once __DIR__ . '/db_connect.php';
        // connecting to db
        $db = new DB_CONNECT();
 
        // mysql inserting a new row
        $result = mysql_query("INSERT INTO posts_reports(PID, time, ip, reason) VALUES('$postId', '$time', '$ip', '$reason')");
 
        // check if row inserted or not
        if ($result) {
            // successfully inserted into database
            $response["success"] = 1;
            $response["message"] = "Post report is inserted successfully!";
 
            // echoing JSON response
            echo json_encode($response);
        } else {
            // failed to insert row
            $response["success"] = 0;
            $response["message"] = "Oops! An error occurred.";
 
            // echoing JSON response
            echo json_encode($response);
        }
    } else {
        // required field is missing
        $response["success"] = 0;
        $response["message"] = "Required fields is missing";
 
        // echoing JSON response
        echo json_encode($response);    
    }
?>
