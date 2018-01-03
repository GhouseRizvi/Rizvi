package ploymorphism;

public class AnimlMain {

	public static void main(String[] args) {
		VoiceImplementation v = new VoiceImplementation();
		v.makeVoice(new Cat());
		v.makeVoice(new Dog());
		v.makeVoice(new Snake());
	}
}
