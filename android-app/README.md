# AdminPanelAZ Android

Android WebView wrapper for the existing AdminPanelAZ web interface.

- Opens the existing panel at https://kvn.suyagin.com/
- Does not add or replace panel functionality.
- Uses the panel's existing authentication and server-side API.
- Supports cookies, file selection, and downloads.

## Build

From this directory:

```bash
gradle assembleDebug
```

The APK is written to `app/build/outputs/apk/debug/app-debug.apk`.

GitHub Actions builds this APK on pushes to the `android-wrapper` branch and on manual workflow dispatch.
