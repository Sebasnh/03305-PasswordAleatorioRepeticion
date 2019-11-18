/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        final char CHAR_MIN = 'A';
        final char CHAR_MAX = 'Z';
        final int CARACTERES = 8;

        int i = 0;

        System.out.print("Password ...: ");

        while (i < CARACTERES) {

            char letra = (char) (RND.nextInt(CHAR_MAX - CHAR_MIN + 1) + CHAR_MIN);

            System.out.print(letra);

            i++;

        }
       
        System.out.println();

    }

}
