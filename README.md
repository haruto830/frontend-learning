# my-todo-app
技術検証用のTODOアプリ。
- バックエンド: Kotlin, Spring Boot
- フロントエンド: TypeScript, Next.js
- データベース: PostgreSQL

## 構成
```
.
├── backend   # バックエンド (APIサーバー)
├── db        # データベース (PostgreSQL)
└── frontend  # フロントエンド (Webアプリ)
```

各コンポーネントはdockerコンテナで動作し、以下のように通信します。  
`Frontend  →  Backend  →  Database`

## 起動手順
※Dockerがインストールされている前提です。

```bash
docker compose build
docker compose up -d
```
backend / frontend / db の 各dockerコンテナ が起動します。

起動が成功すると、以下でアプリにアクセスできます。
- フロントエンド: http://localhost:3000
- バックエンド: http://localhost:8080
