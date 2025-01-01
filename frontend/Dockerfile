# ベースイメージ
FROM node:23-slim

# 作業ディレクトリ
WORKDIR /app

# パッケージのインストール
COPY package.json package-lock.json ./
RUN npm install

# アプリケーションのソースコードをコピー
COPY . .

# 開発サーバーを起動
CMD ["npm", "run", "dev"]
