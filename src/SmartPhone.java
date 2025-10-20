
public class SmartPhone implements Mp3Player {
//クラスにインターフェイスを実装するにはimplementsを指定しなくてはいけない
//また、Mp3Playerで作ったルール(メゾット)は必ずSmartPhoneクラスで上書きし、処理内容を記述する必要がある

	public void play() {
		System.out.println("再生");
	}
	
	public void stop() {
		System.out.println("停止");
	}
	
	public void next() {
		System.out.println("次へ");
	}
	
	public void back() {
		System.out.println("戻る");
	}
	//※必ずインターフェイスに書いたメゾットの処理内容を書く
	
	
	//Mp3Playerがインターフェイスなので、必ずSmartPhoneクラスにはMp3Playerで作ったルール(メゾット)と
	//→メゾットを書き、さらに処理内容を追加で書かないといけない(処理の内容は自由({}で囲った内容))
}