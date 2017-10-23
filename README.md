## dn-ftp-ext
Пакет для работы с FTP.
По вопросам - https://vk.com/dn_extension или https://vk.com/broelik.
## Скачать
Последняя версия - https://github.com/broelik/dn-ftp-ext/releases/latest
## Пример кода
Подключение:
```php
$client = new FTPClient;
$client->connect($host, $port); // По умолчания порт = 21

$client->disconnect($sendQuitCommand); // Отключиться
```
Авторизация:
```php
$client->login($username, $password);
```
Работа с файлами:
```php
$client->currentDirectory(); // Получить текущаю директорию
$client->parentDirectory(); // Родительская директория
$client->changeDirectory($dir); // Сменить директорию
$client->createDirectory($dir); // Создать директорию
$client->deleteDirectory($dir); // Удалить директорию
$client->list(); // Получить список файлов в текущей директории

$client->deleteFile($fname); // Удалить файл
$client->upload($fname); // Загрузить файл
$client->download($fname, $to); // Скачать файл

$client->rename($old, $new); // Переименовать файл
```
Пример использования:
https://hub.develnext.org/project/SrtCjqnoXnjk
