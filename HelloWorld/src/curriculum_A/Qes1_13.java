package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		// 問題1
		// 下記9個をローカル変数として宣言のみしてください
		// ・バイト型・短整数型・整数型・長整数型
		// ・単精度浮動小数点数型・倍精度浮動小数点数型
		// ・文字型・文字列型
		// ・ブーリアン型

		// バイト型の宣言
		byte bt;

		// 短整数型の宣言
		short sh;

		// 整数型の宣言
		int i;

		// 長整数型の宣言
		long lo;

		// 単精度浮動小数点数型の宣言
		float ft;

		// 倍精度浮動小数点数型の宣言
		double dl;

		// 文字型の宣言
		char ch;

		// 文字列型の宣言
		String st;

		// ブーリアン型の宣言
		boolean bl;

		// 問題2
		// それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください

		// バイト型
		bt = 0;

		// 短整数型
		sh = 0;

		// 整数型
		i = 0;

		// 長整数型
		lo = 0L;

		// 単精度浮動小数点数型
		ft = 0.0f;

		// 倍精度浮動小数点数型
		dl = 0.0d;

		// 文字型
		ch = '\u0000';

		// 文字列型
		st = null;

		// ブーリアン型
		bl = false;

		// 問題3
		// 初期化をしたそれぞれの変数に下記の値を代入してください

		// バイト型
		bt = 10;

		// 短整数型
		sh = 100;

		// 整数型
		i = 1000;

		// 長整数型
		lo = 10000;

		// 単精度浮動小数点数型
		ft = 9.5F;

		// 倍精度浮動小数点数型
		dl = 10.5;

		// 文字型
		ch = 'a';

		// 文字列型
		st = "こんにちは";

		// ブーリアン型
		bl = true;

		// 問題4
		// 下記の通りにコンソール出力されるようにしてください
		// 上記で作成した変数を必ず使用すること

		// 11110
		// 20
		// a ハロー true
		// 11130
		// 10000000000
		// 0.105
		// -90

		System.out.println(bt + sh + i + lo);
		System.out.println(bt + bt);
		System.out.println(ch + " " + st + " " + bl);
		System.out.println(lo + i + sh + bt + bt + bt);
		System.out.println(bt * sh * i * lo);
		System.out.println(dl / sh);
		System.out.println(bt - sh);
		
		
		// 問題5
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。

		int num= 20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		
		
		// 問題6
		//『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		System.out.println("初めまして"+ name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」
		
		
		//問題7
		// 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること
		
		double height2 = 1.705;
		double bmi = weight/(height2*height2);
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		
		
		//問題8
		//6で宣言した変数に再代入し下記の通りコンソールに出力してください
		//初めまして鈴木一郎です
		//年齢は24歳です
		//身長168.5cmです
		//体重は64.2kgです
		//好きな食べ物はオムライスです
		//BMIは22.6です
		
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		height2 = 1.685;
		bmi = weight/(height2*height2);
		
		System.out.println("初めまして"+ name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		
		
		//問題9
		//8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		//初めまして鈴木一郎です
		//年齢は48歳です
		//身長337.0cmです
		//体重は128.4kgです
		//好きな食べ物はオムライスです
		//BMIは11.31です
		
		age = age + age;
		height = height + height;
		weight = weight + weight;
		height2 = height2 + height2;
		bmi = weight/(height2*height2);
		
		System.out.println("初めまして"+ name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		
		
		//問題10
		//8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません

		System.out.println(age >= 25);
		
		
		//問題11
		//8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください

		age = 24;
		height = 168.5;
		weight = 64.2;
		
		String strage = String.valueOf(age);
		String strheight = String.valueOf(height);
		String strweight = String.valueOf(weight);
		
		System.out.println(strage + strheight + strweight);
		
		
		//問題12
		//11で変換した【年齢・身長】を整数型に変換して出力してください

		int intage = Integer.parseInt(strage);
		double dblheight = Double.parseDouble(strheight);
		int intheight = (int)dblheight;
		
		System.out.println(intage);
		System.out.println(intheight);
		
		
		//問題13
		//12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//ただしif文は使わないでください
		
		System.out.println(intage >= 25 || intheight >= 160);


		

	}

}
