import React , {useMemo} from 'react';
import { Form, Input } from 'antd';

const NickNameForm = () => {
  const style = useMemo(() => ({ margin:'1%', padding:'10px' }), []);
  return(
    <Form style={style} >
      <Input.Search addonBefore="닉네임" enterButton="수정" />
    </Form>
  );
};

export default NickNameForm;