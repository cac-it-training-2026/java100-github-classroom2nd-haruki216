/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述
interface IchiefTresurer {
	public void calculate();
}

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	public void learn();

}

//ここにSamuraiクラスを記述
abstract class Samurai {
	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();

}

//ここにRetainerクラスを記述
class Retainer implements IchiefTresurer, ICelebrity {
	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}

	public void calculate() {
		System.out.println("藩の計算をするよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述;
		Retainer retainer = new Retainer();
		retainer.calculate();
		retainer.learn();

	}
}
