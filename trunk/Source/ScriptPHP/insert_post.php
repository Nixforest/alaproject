<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    $response = array();
    if(isset($_POST['USERID'])
            && isset($_POST['story']) && isset($_POST['tags'])
            && isset($_POST['source']) && isset($_POST['nsfw'])
            && isset($_POST['pic']) && isset($_POST['youtube_key'])
            && isset($_POST['fod_key']) && isset($_POST['url'])
            && isset($_POST['time_added']) && isset($_POST['date_added'])
            && isset($_POST['active']) && isset($_POST['phase'])
            && isset($_POST['favclicks']) && isset($_POST['last_viewed'])
            && isset($_POST['mod_yes']) && isset($_POST['mod_no'])
            && isset($_POST['pip']) && isset($_POST['pip2'])
            && isset($_POST['unfavclicks']) && isset($_POST['fix'])
            && isset($_POST['short']) && isset($_POST['ttime'])
            && isset($_POST['htime']) && isset($_POST['feat'])
            && isset($_POST['rec']) && isset($_POST['view'])
            && isset($_POST['bulk']) && isset($_POST['post_content'])){
        $userId         = $_POST['USERID'];
        $story          = $_POST['story'];
        $tags           = $_POST['tags'];
        $source         = $_POST['source'];
        $nsfw           = $_POST['nsfw'];
        $pic            = $_POST['pic'];
        $youtubeKey     = $_POST['youtube_key'];
        $fod_key        = $_POST['fod_key'];
        $url            = $_POST['url'];
        $time           = $_POST['time_added'];
        $date           = $_POST['date_added'];
        $active         = $_POST['active'];
        $phase          = $_POST['phase'];
        $favorited      = $_POST['favclicks'];
        $lastview       = $_POST['last_viewed'];
        $mod_yes        = $_POST['mod_yes'];
        $mod_no         = $_POST['mod_no'];
        $pip            = $_POST['pip'];
        $pip2           = $_POST['pip2'];
        $unfavorited    = $_POST['unfavclicks'];
        $fix            = $_POST['fix'];
        $short          = $_POST['short'];
        $ttime          = $_POST['ttime'];
        $htime          = $_POST['htime'];
        $feat           = $_POST['feat'];
        $rec            = $_POST['rec'];
        $view           = $_POST['view'];
        $bulk           = $_POST['bulk'];
        $post_content   = $_POST['post_content'];
        // include db connect class
        require_once __DIR__ . '/db_connect.php';
        // connecting to db
        $db = new DB_CONNECT();
 
        // mysql inserting a new row
        $result = mysql_query("INSERT INTO posts(USERID, story, tags, source, nsfw,"
                . "pic, youtube_key, fod_key, url, time_added, date_added, active, phase,"
                . "favclicks, last_viewed, mod_yes, mod_no, pip, pip2, unfavclicks, fix,"
                . "short, ttime, htime, feat, rec, view, bulk, post_content) VALUES("
                . "'$userId', '$story', '$tags', '$source', '$nsfw', '$pic', '$youtubeKey',"
                . "'$fod_key', '$url', '$time', '$date', '$active', '$phase', '$favorited',"
                . "'$lastview', '$mod_yes', '$mod_no', '$pip', '$pip2', '$unfavorited', '$fix'"
                . "'$short', '$ttime', '$htime', '$feat', '$rec', '$view', '$bulk', '$post_content')");
 
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
