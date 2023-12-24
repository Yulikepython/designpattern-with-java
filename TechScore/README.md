# デザインパターンの学習

[techscore](https://www.techscore.com/)

## 学習
[ここから](https://www.techscore.com/tech/DesignPattern/AbstractFactory)


## Eclipse
1. Projectを作成
1. Packageを作成
1. Class/Interfaceなどを作成

### クラスの作成
Package内には、Mainという名で、static Main関数が必要。
最初に作るものは、クラス作成の際にチェックを入れる。

## Iterator
[リンク](https://www.techscore.com/tech/DesignPattern/Iterator/Iterator1)

** ポイント**
1. 抽象的なインターフェース: AggregateとIteratorを作る
1. それぞれをImplementsしたクラスを作り、Iterator具体クラスを実行する
1. Aggregate具体クラスが変更になっても、影響を受けない

** [こちら](https://www.techscore.com/tech/DesignPattern/Iterator/Iterator4)の課題は終わらせたい。**

## Adaptor
[リンク](https://www.techscore.com/tech/DesignPattern/Adapter/)

** ポイント**
1. 抽象クラスでは決定した実施すべき行動を示す
1. 具体クラスでその中身を実行する
1. Mainではその抽象クラスを実行するだけで、具体クラスの中身が実行される

## TemplateMethod
[リンク](https://www.techscore.com/tech/DesignPattern/TemplateMethod)

** ポイント**
1. 抽象クラスにはabstractの手段を記述し、実行メソッドを書く
1. 具体クラスで具体的な手段を書く
1. 具体クラスで継承した実行メソッドを実行する

## FactoryMethod
[リンク](https://www.techscore.com/tech/DesignPattern/FactoryMethod)

** ポイント**
1. CreateMethodを親クラスで作ることで、子クラスでオーバーライド・柔軟に対応できる

## Singleton
[リンク](https://www.techscore.com/tech/DesignPattern/Singleton)

** ポイント**
1. Javaの仕様で、クラス初期化のタイミングは初めてstaticメソッドがおこなわれたときなどとされている
1. コンストラクタをprivateとすることで、外部からアクセスできず一度だけしかインスタンスが作られない。
1. hashCode()で同一だということが確認できる

## Prototype
[リンク](https://www.techscore.com/tech/DesignPattern/Prototype)

** ポイント**
1. 同じInterfaceを持つ、中身の違うクラスを作る
1. 特定のクラスインスタンスのコピーが大量に作れる

## Builder
[リンク](https://www.techscore.com/tech/DesignPattern/Builder)

** ポイント**
1. Director(作業過程)とBilder(表現形式)で構成
1. Builderを変更しても、Directorのコードに影響がない