using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Gestures.RNGestures
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNGesturesModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNGesturesModule"/>.
        /// </summary>
        internal RNGesturesModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNGestures";
            }
        }
    }
}
