package com.company;

/**
 * Created by Администратор on 24.05.2015.
 */
public class CalculateClass {
        private int result;


        public void add (int ... params) {
            for (Integer param : params) {
                this.result += param;
            }
        }
        public void minus (int ... params) {

            for (Integer param : params) {
                this.result -= param;

            }
        }
         public void mult (int ... params) {
            this.result = 1;
            for (int param : params) {
                this.result = this.result * param;
            }
        }

        public void divide (int a, int b) {

                this.result = a / b ;
        }
            /*public int sum(int... ns){      That way, you could pass in 2, 3, 4, or even 100 numbers to sum, depending on your need at the time.
                int sum = 0;
                for (int n : ns) {
                    sum += n;
                }
             return sum;
            }*/

        public int getResult() {

            return this.result;
        }

        public void cleanResult() {
            this.result = 0;
        }

    }

