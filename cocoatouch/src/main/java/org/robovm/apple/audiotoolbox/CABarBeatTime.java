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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CABarBeatTime/*</name>*/ 
    extends /*<extends>*/Struct<CABarBeatTime>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CABarBeatTimePtr extends Ptr<CABarBeatTime, CABarBeatTimePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CABarBeatTime() {}
    public CABarBeatTime(int bar, short beat, short subbeat, short subbeatDivisor, short reserved) {
        this.bar(bar);
        this.beat(beat);
        this.subbeat(subbeat);
        this.subbeatDivisor(subbeatDivisor);
        this.reserved(reserved);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int bar();
    @StructMember(0) public native CABarBeatTime bar(int bar);
    @StructMember(1) public native short beat();
    @StructMember(1) public native CABarBeatTime beat(short beat);
    @StructMember(2) public native short subbeat();
    @StructMember(2) public native CABarBeatTime subbeat(short subbeat);
    @StructMember(3) public native short subbeatDivisor();
    @StructMember(3) public native CABarBeatTime subbeatDivisor(short subbeatDivisor);
    @StructMember(4) public native short reserved();
    @StructMember(4) public native CABarBeatTime reserved(short reserved);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
