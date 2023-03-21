# employee-management
社員情報を管理するAPIです。<br>
グループ企業の会社の社員管理を想定して作りました。<br>
社員の基本情報を管理するだけではなく、社員の持つスキルに関しても着目して作成しました。<br>
なぜならば、会社内で社員の持つスキルに関して詳細に把握している企業が少ないように感じたためです。<br>
<br>
希望ポジションはバックエンドエンジニアであるため、APIのみ作成しました。<br>
Swagger上から叩いてみてください。<br>

**ER図を実際の実務に耐えられるように設計したため、全機能を作成しておりません。**<br>

# ER図
![image](https://user-images.githubusercontent.com/40497724/226085559-26d1df07-9c2b-4735-b808-91990bfb574f.png)

- ER図は[A5:SQL Mk-2](https://a5m2.mmatsubara.com/)を用いて作成しました。employee-management\rdb\erフォルダに`employee-management-er-diagram.a5er`というファイル名でER図を置いておりますが、[A5:SQL Mk-2](https://a5m2.mmatsubara.com/)がないと閲覧できません。
- テーブル定義書のHTMLはemployee-management\rdbフォルダに置いております。

- データベース設計は[WEB+DB PRESS Vol.130](https://amzn.asia/d/d9WZIUN)のイミュータブルデータモデル と[楽々ERDレッスン](https://amzn.asia/d/1hdFDWd)を参考にして作成しました。

# 使用技術
- Java 19
- Spring Boot 2.7.7
- Maven 4.0.0
- JUnit 5
- PostgreSQL 14
- MyBatis-Spring 2.2.2
- MyBatis Generator 1.3.0
- GitHub Actions

# アピールポイント
- [リーダブルコード](https://amzn.asia/d/aNXu0D9)や[現場で役立つシステム設計の原則 ~変更を楽で安全にするオブジェクト指向の実践技法](https://amzn.asia/d/3MPRAjj)、[良いコード/悪いコードで学ぶ設計入門](https://amzn.asia/d/0mdnpAQ)を参考に読みやすいコードや保守性の高いコードになるように意識してコーディングをしました。

- データベース設計は実務の中で積めていなかった経験であり、後工程での手戻りが非常に大きくなる工程なので[WEB+DB PRESS Vol.130](https://amzn.asia/d/d9WZIUN)のイミュータブルデータモデル と[楽々ERDレッスン](https://amzn.asia/d/1hdFDWd)を参考にして何度も修正を重ねながら作成しました。

- テストが必要なメソッドに関してはテストを作成し、安心してリファクタリングができるような体制を作りました。

- 一人の開発でもコードを読み返したときに理解しやすくなるように、javadocや意図コメントをコードを書きながら書くように意識しました。

- パッケージはコントローラーやモデル、サービスなど設計パターンでまとめる技術駆動パッケージではなく、業務の関心ごとを元にまとめるようなパッケージにすることにより、一つの機能で複数のパッケージを検索する手間を削減するように努めました。

- エラーメッセージなどのファイルはハードコーディングしないように別途ファイルに書き出すようにして、保守性を高めました。

- GitHub Actionsを用いてCIを構築し、push時に自動テストを実行するようにしました。


# 機能一覧
- ユーザー登録、ログイン機能(JWT認証で実装)
- トランザクション管理機能
- 権限管理機能
- ロギング機能
- CRUD機能
- ビジネスロジックの実装
- バリデーション機能
- GitHub ActionsによるCI機能

# 詳細仕様
- GETは未認証でもできる。
- POSTは認証しないと利用できない。(※データを更新しない[/api/v1/employees/skills/search]は例外)
- DELETEはADMINロールを持つユーザーだけが実行することができる。

# 実行要件
- [JDK 19.x+](https://jdk.java.net/19/)
- [Maven 3.9x+](https://maven.apache.org/download.cgi)
- [PostgreSQL 14](https://www.postgresql.jp/download)

# アプリケーションをローカルで実行する
git cloneをしてプロジェクトを取得する。
```shell
git clone https://github.com/tonbiattack/employee-management.git
```
プロジェクトのパッケージまで移動する。
```shell
cd /your-directory/employee-management
```
実行する。
```shell
mvn spring-boot:run
```

# APIドキュメント
http://localhost:8080/swagger-ui/

![image](https://user-images.githubusercontent.com/40497724/226155789-4c29945b-87ba-434d-9c80-f752f18418a1.png)

# 認証方法
1.ページ下部の`認証`をクリック<br>

![image](https://user-images.githubusercontent.com/40497724/226155782-60425233-aa6e-4b0d-b793-7638fddf1aa3.png)
<br>
<br>
2.`Try it out`をクリック<br>

![image](https://user-images.githubusercontent.com/40497724/226155783-67a5fa31-079a-430b-960f-b110cd8b0b82.png)
<br>
<br>
3.レスポンスをコピーする

![image](https://user-images.githubusercontent.com/40497724/226156070-341dd2b3-c75c-4f7a-9bd1-749665856c78.png)
<br>
<br>
4.画面上部の`Authorize`をクリックする

![image](https://user-images.githubusercontent.com/40497724/226155787-1a395588-0aaf-4970-9738-bd452da9efae.png)
<br>
<br>
5.Beare + コピーしたレスポンスを貼り付けて`Authorize`ボタンをクリック

![image](https://user-images.githubusercontent.com/40497724/226155788-b867cce4-3bfa-404b-9f05-34709d0d3056.png)
<br>
<br>
認証完了。