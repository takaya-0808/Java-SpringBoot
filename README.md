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

1. タスクの追加(```/task```) GET
   1. どの内容のタスクを行うか
2. タスクの情報更新(```/task/id```) POST
   1. 実行前
   2. 実行中
   3. 完了
3. タスクの削除(```/task/id```) DELETE
   1. 不必要になったタスクを消す
4. タスクの更新(```/task/id```) PUT
   1. タスクの更新



