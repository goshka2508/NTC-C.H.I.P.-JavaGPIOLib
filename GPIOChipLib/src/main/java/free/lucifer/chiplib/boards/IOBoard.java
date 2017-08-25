/*
 * Copyright 2016 Denis Andreev.
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
package free.lucifer.chiplib.boards;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public interface IOBoard {

    public void open();

    public void close();

    public void pinMode(Enum pin, Enum mode);

    public void pwmWrite(Enum pin, int value);

    public int analogRead(Enum pin);

    public void analogWrite(Enum pin, int value);

    public int digiatalRead(Enum pin);

    public void digitalWrite(Enum pin, int value);

}
