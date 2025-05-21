import React from 'react';
import { Form, Input, Button } from 'antd';

const CommentForm = () => {
    return(<Form layout="vertical" style={{ margin:'3%' }}>
      <Form.Item name="comment">
        <Input.TextArea placeholder='댓글을 적어주세요'
            maxLength={200} />
      </Form.Item>
      <Form.Item>
        <Button type="primary" style={{float:'right'}} htmlType='submit'>댓글</Button>
      </Form.Item>
    </Form>);
};

export default CommentForm;