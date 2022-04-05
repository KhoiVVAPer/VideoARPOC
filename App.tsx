import React from 'react';
import {Text, TouchableOpacity, View} from 'react-native';
import {NativeModules} from 'react-native';
const {VideoPOCModule} = NativeModules;
import styles from './components/Style';

// const config = {
//   appId: '9b2a051f9ed64160ad9d789e229eacad',
//   token:
//     '0069b2a051f9ed64160ad9d789e229eacadIADCOKu9sGsm4hf0k3bR6FpTe2jnWMeU1vsD/0yzyUeZMs9dw48AAAAAEADJZeRXnCVNYgEAAQCbJU1i',
//   channelName: 'khoichannel2',
// };

const App = () => {
  const onPressNativeModules = () => {
    VideoPOCModule.joinChannel();
  };

  return (
    <View style={styles.max}>
      <View style={styles.max}>
        <View style={styles.buttonHolder}>
          <TouchableOpacity
            onPress={onPressNativeModules}
            style={styles.button}>
            <Text style={styles.buttonText}> onPressCallVideo </Text>
          </TouchableOpacity>
        </View>
      </View>
    </View>
  );
};

export default App;
