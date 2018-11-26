package com.biz.word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class WordExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intCount = 0;
		for(int i = 0 ; i < 5 ; i ++) {
			if(viewWord()) {
				intCount++;
			}
		}
		System.out.println("맞은개수 : " + intCount);
	}
	public static boolean viewWord() {
		List<String> wordList = new ArrayList();	// = new ArrayList();
		boolean retOk = false;
		
		wordList = Arrays.asList(WordBook.word); 	// 배열을 List 객체형으로 변환(객체 = Arrays.asList(배열);)
		
		Collections.shuffle(wordList); 				// List를 무작위로 섞기
		String getWord = wordList.get(0);
//		System.out.println(getWord);
		
		String[] quizWord = getWord.split(":");
		System.out.println("다음 제시된 단어를 완성하시오");
		System.out.println(quizWord[1]);
		
		String[] spWord = quizWord[0].split("");			// quizWord의 배열중 0번째배열을 ""를 기준으로 자르고
		List<String> spWordList = Arrays.asList(spWord);	// 객체형으로 변환하고
		Collections.shuffle(spWordList);					// 이를 무작위로 섞고
		System.out.println(spWordList);						// 단어 한글자씩 잘라서 무작위로 섞은 해당 문자를 보여라
		
		Scanner scanner = new Scanner(System.in);
		String inputWord = scanner.nextLine();
		if(quizWord[0].equalsIgnoreCase(inputWord)) {
			System.out.println("참 잘했어요!!");
			retOk = true;
		} else {
			System.out.println(quizWord[0] + "입니다.");
		}
		return retOk ;
	}

}
