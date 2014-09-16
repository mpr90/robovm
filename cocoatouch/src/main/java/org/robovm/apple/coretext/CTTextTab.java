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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTTextTab/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CTTextTabPtr extends Ptr<CTTextTab, CTTextTabPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CTTextTab.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CTTextTab() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    public static CTTextTab create(CTTextAlignment alignment, double location, CTTextTabOptions options) {
        return create(alignment, location, options.getDictionary());
    }
    /**
     * @since Available in iOS 3.2 and later.
     */
    public CTTextTabOptions getOptions() {
        return new CTTextTabOptions(getOptions0());
    }
    /*<methods>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTTextTabGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTTextTabCreate", optional=true)
    protected static native CTTextTab create(CTTextAlignment alignment, double location, NSDictionary<NSString, NSObject> options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTTextTabGetAlignment", optional=true)
    public native CTTextAlignment getAlignment();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTTextTabGetLocation", optional=true)
    public native double getLocation();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTTextTabGetOptions", optional=true)
    protected native NSDictionary<NSString, NSObject> getOptions0();
    /*</methods>*/
}
