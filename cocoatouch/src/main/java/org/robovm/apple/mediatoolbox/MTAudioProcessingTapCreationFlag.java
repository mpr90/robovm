/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.mediatoolbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/ extends Bits</*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/> {
    /*<values>*/
    public static final MTAudioProcessingTapCreationFlag None = new MTAudioProcessingTapCreationFlag(0L);
    public static final MTAudioProcessingTapCreationFlag reEffects = new MTAudioProcessingTapCreationFlag(1L);
    public static final MTAudioProcessingTapCreationFlag ostEffects = new MTAudioProcessingTapCreationFlag(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/[] values = _values(/*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/.class);

    public /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/(long value) { super(value); }
    private /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/(value, mask);
    }
    protected /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTAudioProcessingTapCreationFlag/*</name>*/[] values() {
        return values.clone();
    }
}
