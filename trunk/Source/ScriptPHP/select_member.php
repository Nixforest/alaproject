<?php
    $response = array();
    // include db connect class
    require_once __DIR__ . '/db_connect.php';
    // connecting to db
    $db = new DB_CONNECT();
    if(isset($_GET['email'])){
	$email = $_GET['email'];

	//Get user from user id
	$result = mysql_query("SELECT USERID, email, username, password, fullname FROM members WHERE email = $email");
	if(!empty($result)){
            if(mysql_num_rows($result) > 0){
                $result = mysql_fetch_array($result);
		$member = array();
                $member["USERID"] = $result["USERID"];
		$member["email"] = $result["email"];
		$member["username"] = $result["username"];
		$member["password"] = $result["password"];
		$fullName["fullname"] = $result["fullname"];
		
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