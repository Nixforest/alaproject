<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    $response = array();
    if(isset($_POST['email'])
            && isset($_POST['username']) && isset($_POST['password'])
            && isset($_POST['pwd']) && isset($_POST['fullname'])
            && isset($_POST['gender']) && isset($_POST['description'])
            && isset($_POST['country']) && isset($_POST['yourviewed'])
            && isset($_POST['profileviews']) && isset($_POST['youviewed'])
            && isset($_POST['addtime']) && isset($_POST['lastlogin'])
            && isset($_POST['verified']) && isset($_POST['status'])
            && isset($_POST['profilepicture']) && isset($_POST['remember_me_key'])
            && isset($_POST['remember_me_time']) && isset($_POST['ip'])
            && isset($_POST['lip']) && isset($_POST['website'])
            && isset($_POST['news']) && isset($_POST['mylang'])
            && isset($_POST['color1']) && isset($_POST['color2'])
            && isset($_POST['filter']) && isset($_POST['points'])
            && isset($_POST['twitter_id']) && isset($_POST['cover'])){
		$email            = $_POST['email'];
		$username         = $_POST['username'];
		$password         = $_POST['password'];
                $pwd              = $_POST['pwd'];
		$fullname         = $_POST['fullname'];
                $gender           = $_POST['gender'];
                $description      = $_POST['description'];
                $country          = $_POST['country'];
                $yourviewed       = $_POST['yourviewed'];
                $profileviews     = $_POST['profileviews'];
                $youviewed        = $_POST['youviewed'];
                $addtime          = $_POST['addtime'];
                $lastlogin        = $_POST['lastlogin'];
                $verified         = $_POST['verified'];
                $status           = $_POST['status'];
                $profilepicture   = $_POST['profilepicture'];
                $remember_me_key  = $_POST['remember_me_key'];
		$remember_me_time = $_POST['remember_me_time'];
                $ip               = $_POST['ip'];
                $lip              = $_POST['lip'];
                $website          = $_POST['website'];
                $news             = $_POST['news'];
                $mylang           = $_POST['mylang'];
                $color1           = $_POST['color1'];
                $color2           = $_POST['color2'];
                $filter           = $_POST['filter'];
                $points           = $_POST['points'];
                $twitter_id       = $_POST['twitter_id'];
                $cover            = $_POST['cover'];
        // include db connect class
        require_once __DIR__ . '/db_connect.php';
        // connecting to db
        $db = new DB_CONNECT();
 
        // mysql inserting a new row
        $result = mysql_query("INSERT INTO members(email, username, password, pwd, fullname,"
                . "gender, description, country, yourviewed, profileviews, youviewed, addtime, lastlogin,"
                . "verified, status, profilepicture, remember_me_key, remember_me_time, ip, lip, website,"
                . "news, mylang, color1, color2, filter, points, twitter_id, cover) VALUES("
                . "'$email', '$username', '$password', '$pwd', '$fullname', '$gender', '$description',"
                . "'$country', $yourviewed, $profileviews, $youviewed, '$addtime', '$lastlogin', '$verified',"
                . "'$status', '$profilepicture', '$remember_me_key', '$remember_me_time', '$ip', '$lip', '$website'"
                . "$news, '$mylang', '$color1', '$color2', $filter, $points, $twitter_id, '$cover')");
 
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
