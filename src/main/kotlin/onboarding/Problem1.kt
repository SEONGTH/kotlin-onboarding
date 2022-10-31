package onboarding

//WooWa_Pre_P1
/*
책은 400P, 1페이지부터 시작되는 책.
--> 변수 400
왼쪽페이지는 홀수, 오른쪽은 짝수.
책을 임의로 펼친다.
---> rand()
왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
--> temp0,1 만들어서 둘 중 큰거 비교.
2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
점수를 비교해 가장 높은 사람이 게임의 승자가 된다.
시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다.
포비와 크롱이 펼친 페이지가 들어있는 리스트/배열 pobi와 crong이 주어질 때,
int pobi[n] , int crong[n]
포비가 이긴다면 1, 크롱이 이긴다면 2, 무승부는 0,
예외사항은 -1로 return 하도록 solution 함수를 완성하라.
--> 예외가 뭐가 나올까

//제한사항
pobi와 crong의 길이는 2이다.
pobi와 crong에는 [왼쪽 페이지 번호, 오른쪽 페이지 번호]가 순서대로 들어있다.
 */

import java.util.Random
import java.util.concurrent.ThreadLocalRandom

//random을 쓰기 위해선 java.util을 import 해야 한다.

//==========================================//
//var
val openbook = (1..399) // 1 <= n <= 399, 첫장과 막장은 안나오기에.
var pobi0 = 0
var pobi1 = pobi0 ++
var pobi_a=0
var pobi_b=0
var pobi_c=0
var pobi_temp = 0
var pobi = 0

var crong0 = 0
var crong1 = crong0 ++
var crong_a=0
var crong_b=0
var crong_c=0
var crong = 0

var result = 0

var array_line1 = arrayOf(pobi0, crong0, result)
var array1_line2 = arrayOf(pobi0, crong0, result)
//이렇게 만들면 추후에 어떤 값이 들어가도 상관없음.

fun pobi_seperate(ret: Int) {
    println("pobi_seperate run!!!")
    if(ret >=100){
        pobi_a = ret/100
        pobi_b = ret/10
        pobi_c = ret/1
        println("pobi : " + pobi_a + " / " + pobi_b + " / "+ pobi_c)

    }
    else{
        pobi_a = 0
        pobi_b = ret / 10
        pobi_c = ret / 1
        println("pobi : " + pobi_a + " / " + pobi_b + " / "+ pobi_c)
    }
}
fun crong_seperate(ret: Int) {
    println("crong_seperate run!!!")
    if(ret >=100){
        crong_a = ret/100
        crong_b = ret/10
        crong_c = ret/1
        println("crong : " + crong_a + " / " + crong_b + " / "+ crong_c)
    }
    else{
        crong_a = 0
        crong_b = ret / 10
        crong_c = ret / 1
        println("crong : " + crong_a + " / " + crong_b + " / "+ crong_c)
    }
}

fun compare(a: Int, b : Int, c: Int): Int {
    println("func_compare run!!!")
    if(a+b+c < a*b*c){
        println("*********")
        return a*b*c
    }else{
        println("+++++++++")
        return a+b+c
    }
}

fun main(args: Array<String>) {
    //변수 정의법 : fun 'method name'('Varible name' : 'Varible Type'): 반환형 {}
    println("Main Run!!!")

    var pobi0 = ThreadLocalRandom.current().nextInt(1,399)
    var crong0 = ThreadLocalRandom.current().nextInt(1,399)

    println("Now :")
    println("pobi0 : "+pobi0 + " / crong0 : " +crong0)
    println("pobi 1 : "+ pobi1 + " / crong 1 : +" +crong)

    pobi = compare(pobi_a,pobi_b,pobi_c)
    crong = compare(crong_a,crong_b,crong_c)

    println("compare result")
    println("pobi : "+pobi + " / crong : " + crong )

    if(pobi > crong){
        result = 1
    }
    else if(pobi < crong){
        result = 2
    }else if(pobi == crong){
        result = 0
    }else{
        result = -1
    }
}
