/*
 * Copyright 2014 Duncan Jones
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cryptonode.ccrypto;

/**
 *
 */
public enum SymmetricAlgorithm {
    AES_128(128, "128-bit AES"),
    AES_192(192, "192-bit AES"),
    AES_256(256, "256-bit AES"),
    DES3(192, "Triple DES"),
    DES2(128, "Double DES"),
    DES(64, "DES");

    private final int keyBitLength;
    private final String name;


    SymmetricAlgorithm(int keyBitLength, String name) {
        this.keyBitLength = keyBitLength;
        this.name = name;
    }


}
