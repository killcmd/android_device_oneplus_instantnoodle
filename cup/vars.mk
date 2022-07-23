ifeq ($(SAUCE),SPARK)
WITH_GAPPS := true
TARGET_FACE_UNLOCK_SUPPORTED := true
SPARK_BUILD_TYPE := OFFICIAL
EXTRA_UDFPS_ANIMATIONS := true
TARGET_SUPPORTS_QUICK_TAP := true
TARGET_SUPPORTS_ADAPTIVE_CHARGING := true
TARGET_BUILD_LAWNCHAIR := true
endif
ifeq ($(SAUCE),ARROW)
ARROW_GAPPS := true
TARGET_FACE_UNLOCK_SUPPORTED := true
EXTRA_UDFPS_ANIMATIONS := true
TARGET_SUPPORTS_QUICK_TAP := true
TARGET_SUPPORTS_ADAPTIVE_CHARGING := true
endif
ifeq ($(SAUCE),AEX)
TARGET_USES_AOSP_RECOVERY := true
WITH_GAPPS := true
EXTRA_UDFPS_ANIMATIONS := true
TARGET_SUPPORTS_QUICK_TAP := true
TARGET_SUPPORTS_ADAPTIVE_CHARGING := true
endif


# General Included
$(call inherit-product, device/oneplus/instantnoodle/cup/custom/custom.mk)
$(call inherit-product, device/oneplus/instantnoodle/cup/needed/needed.mk)
