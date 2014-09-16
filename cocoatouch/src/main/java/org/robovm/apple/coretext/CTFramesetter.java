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
package org.robovm.apple.coretext;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreText")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTFramesetter/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CTFramesetterPtr extends Ptr<CTFramesetter, CTFramesetterPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CTFramesetter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CTFramesetter() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    public CTFrame createFrame(@ByVal CFRange stringRange, CGPath path, CTFrameAttributes frameAttributes) {
        return createFrame(stringRange, path, frameAttributes.getDictionary());
    }
    /**
     * @since Available in iOS 3.2 and later.
     */
    public @ByVal CGSize suggestFrameSize(@ByVal CFRange stringRange, CTFrameAttributes frameAttributes, @ByVal CGSize constraints, CFRange fitRange) {
        return suggestFrameSize(stringRange, frameAttributes.getDictionary(), constraints, fitRange);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTFramesetterGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTFramesetterCreateWithAttributedString", optional=true)
    public static native CTFramesetter create(NSAttributedString string);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTFramesetterCreateFrame", optional=true)
    protected native CTFrame createFrame(@ByVal CFRange stringRange, CGPath path, CFDictionary frameAttributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTFramesetterGetTypesetter", optional=true)
    public native CTTypesetter getTypesetter();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTFramesetterSuggestFrameSizeWithConstraints", optional=true)
    protected native @ByVal CGSize suggestFrameSize(@ByVal CFRange stringRange, CFDictionary frameAttributes, @ByVal CGSize constraints, CFRange fitRange);
    /*</methods>*/
}
