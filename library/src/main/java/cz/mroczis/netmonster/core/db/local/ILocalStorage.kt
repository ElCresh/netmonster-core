package cz.mroczis.netmonster.core.db.local

interface ILocalStorage {

    /**
     * Checks if TAC / LAC endianness in GSM, WCDMA, LTE networks should be flipped
     * no matter what. Applies only for new cell API
     *
     * @see cz.mroczis.netmonster.core.feature.postprocess.SamsungEndiannessPostprocessor
     */
    var locationAreaEndiannessIncorrect: Boolean
}