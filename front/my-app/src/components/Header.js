import React from 'react';

function Header() {
  return (
    <div style={{ display: 'flex', justifyContent: 'space-between', padding: '10px', borderBottom: '1px solid black' }}>
      <div>Войти</div>
      <div>DSN</div>
    </div>
  );
}

export default Header;
