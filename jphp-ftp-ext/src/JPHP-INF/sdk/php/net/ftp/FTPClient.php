<?php
namespace php\net\ftp;
/**
 * Class FTPClient
 */
class FTPClient
{
	public function __construct(){}
	/**
	 * @param string $username
	 * @param string $pass
	 * @param string $account
	 */
	public function login($username, $pass, $account = null){}
	/**
	 * @param string $host
	 * @param int $port
	 * @return array
	 */
	public function connect($host, $port = null){}
	/**
	 * @param boolean $sendQuitCommand
	 */
	public function disconnect($sendQuitCommand = true){}
	/**
	 * @return string
	 */
	public function currentDirectory(){}
	/**
	 * @param string $dir
	 */
	public function changeDirectory($dir){}
	/**
	 * @return string
	 */
	public function parentDirectory(){}
	/**
	 * @param string $oldName
	 * @param string $newName
	 */
	public function rename($oldName, $newName){}
	/**
	 * @param string $fileName
	 */
	public function deleteFile($fileName){}
	/**
	 * @param string $name
	 */
	public function createDirectory($name){}
	/**
	 * @param string $name
	 */
	public function deleteDirectory($name){}
	/**
	 * @param string $fileSpec
	 */
	public function list($fileSpec){}
	/**
	 * @param string $from
	 * @param php\io\File $to
	 * @param callable $callback
	 * @return array
	 */
	public function download($from, $to, $callback = null){}
	/**
	 * @param php\io\File $from
	 * @param string $to
	 * @param callable $callback
	 */
	public function upload($from, $callback = null){}
	/**
	 * @param boolean $sendAborCommand
	 */
	public function abortCurrentDataTransfer($sendAborCommand){}
	/**
	 * @param boolean $passive
	 */
	public function setPassive($passive){}
	/**
	 * @return boolean
	 */
	public function isPassive(){}
	/**
	 * @return boolean
	 */
	public function isConnected(){}
	/**
	 * @return boolean
	 */
	public function isAuthenticated(){}
	/**
	 * @return string
	 */
	public function getHost(){}
	/**
	 * @return int
	 */
	public function getPort(){}
	/**
	 * @return string
	 */
	public function getUsername(){}
	/**
	 * @return string
	 */
	public function getPassword(){}
}