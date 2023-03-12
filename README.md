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

## 機能

1. タスクの追加(```/api/v1/todo```) GET
   1. どの内容のタスクを行うか
2. タスクの情報更新(```/api/v1/todo/id```) POST
   1. 実行前
   2. 実行中
   3. 完了
3. タスクの削除(```/api/v1/todo/id```) DELETE
   1. 不必要になったタスクを消す
4. タスクの更新(```/api/v1/todo/id```) PUT
   1. タスクの更新