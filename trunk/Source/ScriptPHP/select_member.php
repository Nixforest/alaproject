<?php
    $response = array();
    // include db connect class
    require_once __DIR__ . '/db_connect.php';
    // connecting to db
    $db = new DB_CONNECT();
    if(isset($_GET['USERID'])){
	$userId = $_GET['USERID'];

	//Get user from user id
	$result = mysql_query("SELECT * FROM members WHERE USERID = $userId");
	if(!empty($result)){
            if(mysql_num_rows($result) > 0){
                $result = mysql_fetch_array($result);
		$member = array();
                $member["USERID"]           = $result["USERID"];
		$member["email"]            = $result["email"];
		$member["username"]         = $result["username"];
		$member["password"]         = $result["password"];
                $member["pwd"]              = $result["pwd"];
		$member["fullname"]         = $result["fullname"];
                $member["gender"]           = $result["gender"];
                $member["description"]      = $result["description"];
                $member["country"]          = $result["country"];
                $member["yourviewed"]       = $result["yourviewed"];
                $member["profileviews"]     = $result["profileviews"];
                $member["youviewed"]        = $result["youviewed"];
                $member["addtime"]          = $result["addtime"];
                $member["lastlogin"]        = $result["lastlogin"];
                $member["verified"]         = $result["verified"];
                $member["status"]           = $result["status"];
                $member["profilepicture"]   = $result["profilepicture"];
                $member["remember_me_key"]  = $result["remember_me_key"];
		$member["remember_me_time"] = $result["remember_me_time"];
                $member["ip"]               = $result["ip"];
                $member["lip"]              = $result["lip"];
                $member["website"]          = $result["website"];
                $member["news"]             = $result["news"];
                $member["mylang"]           = $result["mylang"];
                $member["color1"]           = $result["color1"];
                $member["color2"]           = $result["color2"];
                $member["filter"]           = $result["filter"];
                $member["points"]           = $result["points"];
                $member["twitter_id"]       = $result["twitter_id"];
                $member["cover"]            = $result["cover"];                
                
		//Successful
		$response["success"] = 1;	
		$response["member"] = array();
		array_push($response["member"], $member);
		echo json_encode($response);
            }else{
                $response["success"] = 0;
                $response["message"] = "No member found";
                echo json_encode($response);
            }
        }else{
            $response["success"] = 0;
            $response["message"] = "No member found";
            echo json_encode($response);
        }
    }else{
	$response["success"] = 0;
	$response["message"] = "Require field is missing";
	echo json_encode($response);
    }
?>