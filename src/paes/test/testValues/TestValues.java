package paes.test.testValues;

public class TestValues {

    private double[][] inputValues = {
            {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1}, {1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0}, {1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1}, {1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1}, {1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1}, {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1}, {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0}, {1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0}, {0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, {1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1}, {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0},
            {1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, {1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1},
            {0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1}, {1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0}, {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1},
            {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0}, {0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0}, {1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1},
            {0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1}, {0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1},};

    private double[][] wl1 = {
            {1.5106179332294826E16, 1.4895588397255958E16, 3.507166043166901E15, 1.0682079956653614E16, 9.330046163902644E15, 1.379223456794933E16, 1.238231683197166E16},
            {1.1986932242236992E16, 9.221889653075804E15, 1.575843257316258E15, 1.4099941723314942E16, 9.052611330373689E14, -1.5500110890491295E15, 1.2897002556263708E16},
            {8.122018532052691E15, 1.4377507312098856E16, 6.948237311109259E15, 3.611492493593607E15, 1.5963818105846728E16, 7.325203015988635E15, 7.543725965246848E15},
            {2.3769663560826965E15, 7.688651960271293E15, 1.500180504043933E16, 1.3008694065965126E16, 2.82015471817492E15, 3.960390949358194E15, 1.596344425054899E16},
            {1.5411262572207874E16, 7.597046743213631E15, -1.0206491302385297E14, 5.13414613597392E15, 7.239808626033795E15, -1.026387571046571E16, 2.5197374354915985E15},
            {2.313148992312655E15, 8.778693835336669E15, 8.458134811377739E15, 1.4715159661278874E16, 2.4617315109653295E15, 1.2976862320355548E16, 5.436639230182347E14},
            {9.749323684934036E15, 1.0586580346625749E15, 1.6018600202309152E15, 8.584142622698772E15, 1.0214941735562591E15, -8.061048330877451E15, -1.4787069220948032E15},
            {1.2389943122110666E16, 6.601107751864338E15, 1.5231583931608212E16, 4.556144601165328E15, 1.6189566705678384E16, 1.3637602427813892E16, 2.1557607037862425E14},
            {9.060445705195354E15, 3.92727091183348E15, 5.775069852048498E15, 1.4500980512812096E16, 1.1414598290388808E15, 1.6712374693222258E15, 1.4933708782709072E16},
            {1.2787911923177658E16, 1.191362820502268E16, 7.953211701826275E14, 1.0402380909487021E15, 1.1629157367006014E16, -4.83589248824816E15, 8.343331774533249E15},
            {1.2265889329006586E16, 7.393552426520139E15, 8.494724115077499E15, 9.776164185284288E15, 7.220581256558209E15, 3.3687421585527925E15, 3.242389049469291E15},
            {8.471746763465696E15, 6.651112467429997E15, 6.641678432647103E15, 1.5947667154503394E16, 9.164964392009336E15, 8.109166870632217E15, -4.639584494090801E14},
            {1.2002606661445562E16, 3.865691458732239E13, 4.808888501708344E15, 4.733634696541225E15, 1.4959736931665696E16, -1.5427790580806304E16, 5.460158525980105E15},
            {7.173082577631209E15, 1.4472435833341678E16, 1.2204917495904592E16, 1.978744148663094E15, 8.252656074684507E15, -1.5381683637991154E16, 1.4043354647163264E16},
            {1.320715157812878E16, 7.088604590621604E15, 1.2310076900928286E16, 7.669762961187925E15, 5.06409387699725E15, -7.377585261031555E14, 9.683490748757654E15}};

    private double[][] wl2 = {
            {2.037759384396802E15, -4.1835542893039965E15, 3.953911607299353E14, -7.931506502367456E15, 1.5215379391965818E15, -1.1689053152370792E16, 8.160372307348061E15},
            {2.3100098922752275E15, 1.543029049916286E14, -1.9972223108134368E15, 5.568564329550579E14, -5.32311865843086E15, 1.2405126004924596E16, -8.105954265902169E15},
            {-1.602860033167724E15, 8.135384154474748E14, 2.1213119599377262E15, -3.935311884518636E15, -1.411832164164409E15, -39.88678337721795, 4.015153706465605E15}};

    public double[][] getInputValues() {
        return inputValues;
    }

    public void setInputValues(double[][] inputValues) {
        this.inputValues = inputValues;
    }

    public double[][] getWl1() {
        return wl1;
    }

    public void setWl1(double[][] wl1) {
        this.wl1 = wl1;
    }

    public double[][] getWl2() {
        return wl2;
    }

    public void setWl2(double[][] wl2) {
        this.wl2 = wl2;
    }
}