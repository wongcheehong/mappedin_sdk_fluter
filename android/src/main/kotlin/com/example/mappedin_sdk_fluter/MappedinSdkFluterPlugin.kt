package com.example.mappedin_sdk_fluter

import androidx.annotation.NonNull

import io.flutter.embedding.engine.plugins.FlutterPlugin

/** MappedinSdkFluterPlugin */
class MappedinSdkFluterPlugin: FlutterPlugin {
  /// The MethodChannel that will the communication between Flutter and native Android
  ///
  /// This local reference serves to register the plugin with the Flutter Engine and unregister it
  /// when the Flutter Engine is detached from the Activity
  override fun onAttachedToEngine(@NonNull flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
    flutterPluginBinding.platformViewRegistry
                .registerViewFactory(
                        "plugins.amos.views/mappedin",
                        MapdinNativeWidgetFactory(flutterPluginBinding.binaryMessenger)
                )
  }

  override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
    
  }
}
