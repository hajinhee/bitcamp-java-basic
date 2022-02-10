package com.example.javabasic.quiz.service;

/**
 * packageName: com.example.javabasic.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : HAJINHEE
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-10   HAJINHEE    최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service{

/**
 * 1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
 * 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
 * 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
 * */

    @Override
    public void bubbleSort() {
        boolean duplicate;
        int num = 0;
        int[] array = new int[10];

        for (int i=0; i<array.length; i++) {
            duplicate = true;
            while (duplicate) {
                num = (int)(Math.random()*100)+1;
                duplicate = false;
                for (int j=0; j<i; j++) {
                    if (array[j]==num) {
                        duplicate = true;
                        break;
                    }
                }
            }
            array[i] = num;
        }
        for (int i=0; i< array.length; i++){
            for (int j=0; j< array.length-1; j++){
                if(array[j]>array[j+1]){
                    num = array[j];
                array[j] = array[j+1];
                array[j+1] = num;}
            }
        }

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
    /**
     * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
     * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
     * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
     */

    @Override
    public void insertionSort() {

        boolean duplicate;
        int num = 0;
        int[] array = new int[10];

        for (int i=0; i<array.length; i++) {
            duplicate = true;
            while (duplicate) {
                num = (int)(Math.random()*100)+1;
                duplicate = false;
                for (int j=0; j<i; j++) {
                    if (array[j]==num) {
                        duplicate = true;
                        break;
                    }
                }
            }
            array[i] = num;
        }
        for (int i=0; i<9; i++){
            for (int j=0; j<i; j++){
               if (array[j]>array[i]){
                   num = array[j];
                   array[j] = array[i];
                   array[i] = num;
                }
            }
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]+ "\t");
        }
    }

    /**
     * 1. 주어진 리스트에서 최솟값을 찾는다.
     * 2. 최솟값을 맨 앞 자리의 값과 교환한다.
     * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
     * */

    @Override
    public void selectionSort() {
        boolean duplicate;
        int num = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            duplicate = true;
            while (duplicate) {
                num = (int) (Math.random() * 100) + 1;
                duplicate = false;
                for (int j = 0; j < i; j++) {
                    if (array[j] == num) {
                        duplicate = true;
                        break;
                    }
                }
            }
            array[i] = num;
        }
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            num = array[min];
            array[min] = array[i];
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }
    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
