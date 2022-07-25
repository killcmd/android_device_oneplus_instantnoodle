ifeq ($(SAUCE),SPARK)
WITH_GAPPS := true
TARGET_FACE_UNLOCK_SUPPORTED := true
SPARK_BUILD_TYPE := OFFICIAL
EXTRA_UDFPS_ANIMATIONS := true
TARGET_SUPPORTS_QUICK_TAP := true
TARGET_SUPPORTS_ADAPTIVE_CHARGING := true
TARGET_BUILD_LAWNCHAIR := false
endif
ifeq ($(SAUCE),CHERISH)
TARGET_FACE_UNLOCK_SUPPORTED := true
EXTRA_UDFPS_ANIMATIONS := true
TARGET_SUPPORTS_QUICK_TAP := true
TARGET_INCLUDE_PIXEL_CHARGER := true
TARGET_BOOT_ANIMATION_RES := 1080
CHERISH_BUILD_TYPE=UNOFFICIAL

PRODUCT_GENERIC_PROPERTIES += \
    ro.cherish.maintainer=killcmd
endif

# General Included
$(call inherit-product, device/oneplus/instantnoodle/cup/custom/custom.mk)
$(call inherit-product, device/oneplus/instantnoodle/cup/needed/needed.mk)
