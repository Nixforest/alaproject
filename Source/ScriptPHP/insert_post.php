<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    $response = array();
    if(isset($_POST['PID']) && isset($_POST['USERID'])
            && isset($_POST['story']) && isset($_POST['pic'])
            && isset($_POST['youtube_key']) && isset($_POST['url'])
            && isset($_POST['time_added']) && isset($_POST['date_added'])
            && isset($_POST['favclicks']) && isset($_POST['unfavclicks'])
            && isset($_POST['view'])){
        $postId         = $_POST['PID'];
        $userId         = $_POST['USERID'];
        $story          = $_POST['story'];
        $pic            = $_POST['pic'];
        $youtubeKey     = $_POST['youtube_key'];
        $url            = $_POST['url'];
        $time           = $_POST['time_added'];
        $date           = $_POST['date_added'];
        $favorited      = $_POST['favclicks'];
        $unfavorited    = $_POST['unfavclicks'];
        $view           = $_POST['view'];
        
        // include db connect class
        require_once __DIR__ . '/db_connect.php';
        // connecting to db
        $db = new DB_CONNECT();
 
        // mysql inserting a new row
        $result = mysql_query("INSERT INTO posts(PID, USERID, story, pic,"
                . "youtube_key, url, time_added, date_added, favclicks,"
                . "unfavclicks, view) VALUES($postId', '$userId', '$story',"
                . "'$pic', '$youtubeKey', '$url', '$time', '$date', '$favorited',"
                . "'$unfavorited', '$view')");
 
        // check if row inserted or not
        if ($result) {
            // successfully inserted into database
            $response["success"] = 1;
            $response["message"] = "Post is inserted successfully!";
 
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
