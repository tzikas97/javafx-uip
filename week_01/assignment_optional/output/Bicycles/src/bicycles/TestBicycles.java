/*
 * Copyright 2019 George Tzikas <tzikas97@gmail.com>
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
package bicycles;

/**
 *
 * @author tzikas97
 */
public class TestBicycles {

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Bicycles b1 = new Bicycles(20, 3);
        b1.printDescription();

        System.out.println("----------");

        MountainBikes b2 = new MountainBikes(40, 5, 2);
        b2.printDescription();

    }
}
