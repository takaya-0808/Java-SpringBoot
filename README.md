# Java-SpringBoot ToDo application

## Usage

dockerのコンテナの立ち上げ
```
docker-compose up -d
```
コンテナ内部に入る
```
docker-compose exec app bash
```
jarファイルの```build```
```
sh gradlew build
```
jarの起動
```
java -jar build/libs/app-0.0.1-SNAPSHOT.jar
```

## プレビュー
[確認](http://localhost:8085/todo/api/)

## 機能

1. タスクの取得 GET
   1. (```/task```)
      1. 全てのタスクを取得する
   2. (```/task/id```)
      1. idのタスクを取得する
2. タスクの情報追加 POST
   1. (```/task```)
      1. タスク情報を登録する
3. タスクの削除 DELETE
   1. (```/task/id```)
      1. 不必要になったタスクを削除する
4. タスクの更新 PUT
   1. (```/task/id```)
      1. タスクの更新する



