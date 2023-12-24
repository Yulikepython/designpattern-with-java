# デザインパターンの学習

[techscore](https://www.techscore.com/)

## 学習
[ここから](https://www.techscore.com/tech/DesignPattern/FactoryMethod)


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

