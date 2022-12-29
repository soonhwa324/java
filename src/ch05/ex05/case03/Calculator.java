package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public Paper add(Paper paper) {
		//과제: paper 의 a, b 값을 더한 result 를 paprep 에 적어라.
		//		위 paper 를 return 하라.
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
}
/* 
int a = 0;
int b = 0;
int result = 0;

paper.setA(a);
paper.setB(b);

result = calculator.add(paper.getA(), paper.getB());
paper.setResult(result);

paper.getResult(); 

return  paper;
*/